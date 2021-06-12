import { Task } from './app/models/task';

export const TASKS: Task[] = [
    {
        id: 1,
        text: 'Angular session for new cohort',
        day: 'June 12 at 9:00am',
        reminder: true,
    },
    {
        id: 2,
        text: 'Sonar session for new cohort',
        day: 'June 14 at 9:00am',
        reminder: false
    },
    {
        id: 3,
        text: 'Angular session for new cohort',
        day: 'June 15 at 9:00am',
        reminder: true
    },
    {
        id: 4,
        text: 'Hibernate session for new cohort',
        day: 'June 16 at 9:00am',
        reminder: false
    },
    {
        id: 5,
        text: 'Spring Data JPA session for new cohort',
        day: 'June 17 at 9:00am',
        reminder: true
    },
];