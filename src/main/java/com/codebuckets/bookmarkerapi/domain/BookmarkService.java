package com.codebuckets.bookmarkerapi.domain;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookMarkRepository repository;

    @Transactional
    public BookmarksDTO getBookmarks(Integer page) {
        int pageNo = page < 1 ? 0 : page-1;
        Pageable pageable = PageRequest.of(pageNo, 5, Sort.Direction.DESC, "createdAT");
        return new BookmarksDTO(repository.findBookMarks(pageable));
    }
}
