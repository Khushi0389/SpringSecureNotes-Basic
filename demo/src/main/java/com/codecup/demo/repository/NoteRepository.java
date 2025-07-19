package com.codecup.demo.repository;

import com.codecup.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Integer> {
    // Basic CRUD methods auto available
}
