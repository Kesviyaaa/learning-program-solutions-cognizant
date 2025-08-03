// components/EnrollModal.js
import React, { useContext } from 'react';
import { CourseContext } from '../context/CourseContext';

function EnrollModal({ course, onClose }) {
  const { enrollCourse } = useContext(CourseContext);

  const handleEnroll = () => {
    enrollCourse({ ...course, completed: false });
    onClose();
  };

  return (
    <div className="modal">
      <h2>Enroll in {course.title}</h2>
      <button onClick={handleEnroll}>Confirm Enroll</button>
      <button onClick={onClose}>Cancel</button>
    </div>
  );
}

export default EnrollModal;