
// pages/Dashboard.js
import React, { useContext } from 'react';
import { CourseContext } from '../context/CourseContext';

function Dashboard() {
  const { enrolledCourses } = useContext(CourseContext);
  const completed = enrolledCourses.filter(c => c.completed).length;

  return (
    <div>
      <h2>Dashboard</h2>
      <p>Total Enrolled: {enrolledCourses.length}</p>
      <p>Completed: {completed}</p>
      <p>Pending: {enrolledCourses.length - completed}</p>
    </div>
  );
}

export default Dashboard;