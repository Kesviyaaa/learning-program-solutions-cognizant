// pages/Courses.js
import React, { useEffect, useState } from 'react';
import CourseCard from '../components/CourseCard';

function Courses() {
  const [courses, setCourses] = useState([]);

  useEffect(() => {
    // Replace with actual API
    setCourses([
      { id: 1, title: 'React Basics', description: 'Intro to React' },
      { id: 2, title: 'Advanced React', description: 'Hooks, Context & More' },
    ]);
  }, []);

  return (
    <div>
      <h2>All Courses</h2>
      {courses.map(course => <CourseCard key={course.id} course={course} />)}
    </div>
  );
}

export default Courses;