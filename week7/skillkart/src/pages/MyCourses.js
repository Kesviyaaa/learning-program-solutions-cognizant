// pages/MyCourses.js
import React, { useContext } from 'react';
import { CourseContext } from '../context/CourseContext';
import ProgressBar from '../components/ProgressBar';

function MyCourses() {
  const { enrolledCourses, markCompleted } = useContext(CourseContext);

  return (
    <div>
      <h2>My Courses</h2>
      {enrolledCourses.map(course => (
        <div key={course.id}>
          <h3>{course.title}</h3>
          <ProgressBar completed={course.completed} />
          {!course.completed && (
            <button onClick={() => markCompleted(course.id)}>Mark as Completed</button>
          )}
        </div>
      ))}
    </div>
  );
}

export default MyCourses;
