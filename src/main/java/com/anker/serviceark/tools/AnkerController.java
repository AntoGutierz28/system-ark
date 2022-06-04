package com.anker.serviceark.tools;

import com.anker.serviceark.tools.AnkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
public abstract class AnkerController<Bo, Dto, Id> {
    public abstract AnkerService<Bo, Dto, Id> getService();

    @GetMapping("/all")
    public ResponseEntity<?> getAll(){
        try {
            List<Dto> detail = getService().findAll();
            return ResponseEntity.ok(detail);
        } catch (Exception e) {
            log.error("Error uploading logo", e);
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable("id") Id id){
        try {
            Dto detail = getService().findById(id);
            return ResponseEntity.ok(detail);
        } catch (Exception e) {
            log.error("Error uploading logo", e);
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Dto dto){
        try {
            Dto detail = getService().create(dto);
            return ResponseEntity.ok(detail);
        } catch (Exception e) {
            log.error("Error uploading logo", e);
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Dto dto, @PathVariable("id") Id id){
        try {
            Dto detail = getService().update(dto, id);
            return ResponseEntity.ok(detail);
        } catch (Exception e) {
            log.error("Error uploading logo", e);
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Id id){
        try {
            String detail;
            getService().deleteById(id);
            detail = "ok";
            return ResponseEntity.ok(detail);
        } catch (Exception e) {
            log.error("Error uploading logo", e);
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
    }
}
