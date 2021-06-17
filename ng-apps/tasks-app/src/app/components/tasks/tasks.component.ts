import { Component, OnInit } from '@angular/core';
import { Task } from 'src/app/models/task';
import { TaskManagerService } from 'src/app/services/task-manager.service';

@Component({
  selector: 'app-tasks',
  templateUrl: './tasks.component.html',
  styleUrls: ['./tasks.component.css']
})
export class TasksComponent implements OnInit {

  tasks: Task[] = [];

  constructor(private taskManager: TaskManagerService) { }

  ngOnInit(): void {
    this.taskManager.getTasks().subscribe(
      (retTasks) => this.tasks = retTasks
    );
  }

  createTask(task: Task) {
    console.log(task)
    this.taskManager.createTask(task).subscribe(
        (t) => this.tasks.push(t), 
        (message) =>console.error(message)
    );
  }

  deleteTask(task: Task) {
    this.taskManager.deleteTask(task).subscribe(
      () => this.tasks = this.tasks.filter(t => t.id !== task.id)
    );
  }

  toggleTask(task: Task) {
    task.reminder = !task.reminder;
    this.taskManager.updateTask(task).subscribe();

  }

}
