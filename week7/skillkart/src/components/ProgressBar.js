// components/ProgressBar.js
import React from 'react';

function ProgressBar({ completed }) {
  return (
    <div className="progress-bar">
      <div style={{ width: completed ? '100%' : '50%' }} className="progress-fill">
        {completed ? 'Completed' : 'In Progress'}
      </div>
    </div>
  );
}

export default ProgressBar;