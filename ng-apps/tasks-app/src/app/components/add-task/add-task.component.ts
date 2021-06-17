import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormControl, FormGroup, NgForm, Validators } from '@angular/forms';
import { Task } from 'src/app/models/task';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  @Output() onCreateTask: EventEmitter<Task> = new EventEmitter();

  taskForm: FormGroup;

  createdTask: Task = {};

  constructor() { }

  ngOnInit(): void {
    this.taskForm = new FormGroup({
      text: new FormControl('', [Validators.required, Validators.minLength(5)]),
      day: new FormControl('', [Validators.required, Validators.minLength(5)]),
      reminder: new FormControl(true)
    });
  }

  onSubmit() {
    if (this.taskForm.valid) {
      this.createdTask = this.taskForm.value
      this.onCreateTask.emit(this.createdTask)      
    }else{
      console.log('form data not valid...')
    }

  }

}
