// pages/CourseDetails.js
import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';
import EnrollModal from '../components/EnrollModal';

function CourseDetails() {
  const { id } = useParams();
  const [course, setCourse] = useState(null);
  const [showModal, setShowModal] = useState(false);

  useEffect(() => {
    // Replace with real fetch logic
    setCourse({ id, title: `Course ${id}`, description: `Details of Course ${id}` });
  }, [id]);

  return course ? (
    <div>
      <h2>{course.title}</h2>
      <p>{course.description}</p>
      <button onClick={() => setShowModal(true)}>Enroll</button>
      {showModal && <EnrollModal course={course} onClose={() => setShowModal(false)} />}
    </div>
  ) : <p>Loading...</p>;
}

export default CourseDetails;