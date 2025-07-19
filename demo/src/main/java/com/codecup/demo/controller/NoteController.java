package com.codecup.demo.controller;

import com.codecup.demo.model.Note;
import com.codecup.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    @Autowired
    private NoteService noteService;

    @PostMapping("/add")
    public Note addNote(@RequestBody Note note) {
        return noteService.addNote(note);
    }

    @GetMapping("/{id}")
    public Note getNote(@PathVariable int id) {
        return noteService.getNote(id);
    }

    @PutMapping("/update/{id}")
    public Note updateNote(@PathVariable int id, @RequestBody Note note) {
        return noteService.updateNote(id, note);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteNote(@PathVariable int id) {
        return noteService.deleteNote(id);
    }

    @GetMapping("/all")
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }
}
