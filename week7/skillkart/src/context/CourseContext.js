
// context/CourseContext.js
import React, { createContext, useState } from 'react';

export const CourseContext = createContext();

export const CourseProvider = ({ children }) => {
  const [enrolledCourses, setEnrolledCourses] = useState([]);

  const enrollCourse = (course) => {
    setEnrolledCourses([...enrolledCourses, course]);
  };

  const markCompleted = (courseId) => {
    setEnrolledCourses(enrolledCourses.map(c => c.id === courseId ? { ...c, completed: true } : c));
  };

  return (
    <CourseContext.Provider value={{ enrolledCourses, enrollCourse, markCompleted }}>
      {children}
    </CourseContext.Provider>
  );
};
