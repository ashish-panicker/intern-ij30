import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Task } from 'src/app/models/task';

@Component({
  selector: 'app-task-item',
  templateUrl: './task-item.component.html',
  styleUrls: ['./task-item.component.css']
})
export class TaskItemComponent implements OnInit {

  @Input() task: Task;

  @Output() onDeleteTask: EventEmitter<Task> = new EventEmitter();

  @Output() onToggleTask: EventEmitter<Task> = new EventEmitter();

  constructor() { }

  ngOnInit(): void {
  }

  onDelete(task:Task){
    console.log('emiting delete')
    this.onDeleteTask.emit(task);
  }

  onDoubleClick(task:Task){
    this.onToggleTask.emit(task);
  }

}
