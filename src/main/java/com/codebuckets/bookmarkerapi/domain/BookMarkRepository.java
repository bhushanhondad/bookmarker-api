package com.codebuckets.bookmarkerapi.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookMarkRepository extends JpaRepository<Bookmark, Long> {

    @Query("select new com.codebuckets.bookmarkerapi.domain.BookmarkDTO(b.id,b.title,b.url,b.createdAT) from Bookmark b")
    Page<BookmarkDTO> findBookMarks(Pageable pageable);
}
