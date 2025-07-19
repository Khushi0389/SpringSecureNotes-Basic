package com.codecup.demo.service;

import com.codecup.demo.model.Note;
import com.codecup.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public Note addNote(Note note) {
        return noteRepository.save(note);
    }

    public Note getNote(int id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Note updateNote(int id, Note note) {
        note.setId(id);
        return noteRepository.save(note);
    }

    public String deleteNote(int id) {
        noteRepository.deleteById(id);
        return "Note with ID " + id + " deleted";
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
}
