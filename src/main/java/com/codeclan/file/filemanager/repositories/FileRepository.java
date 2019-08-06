package com.codeclan.file.filemanager.repositories;

import com.codeclan.file.filemanager.models.file;
import com.codeclan.file.filemanager.models.file;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<file, Long> {
}



