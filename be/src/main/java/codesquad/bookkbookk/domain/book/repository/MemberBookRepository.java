package codesquad.bookkbookk.domain.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codesquad.bookkbookk.domain.book.data.entity.MemberBook;

public interface MemberBookRepository extends JpaRepository<MemberBook, Long> {

}