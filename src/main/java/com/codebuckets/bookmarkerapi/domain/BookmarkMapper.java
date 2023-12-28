package com.codebuckets.bookmarkerapi.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {
    public BookmarkDTO toDto(Bookmark bookmark) {
        BookmarkDTO bookmarkDTO = new BookmarkDTO();
        bookmarkDTO.setId(bookmark.getId());
        bookmarkDTO.setUrl(bookmark.getUrl());
        bookmarkDTO.setTitle(bookmark.getTitle());
        bookmarkDTO.setCreatedAT(bookmark.getCreatedAT());
        return bookmarkDTO;
    }
}
