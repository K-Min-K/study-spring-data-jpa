package org.zerock.myapp.persistence;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.zerock.myapp.entity.Board;

import java.util.Date;
import java.util.List;

// @Query(nativeSQL) 어노테이션 기반으로, 개발자가 직접 작성한 SQL문을 실행시키는
// 쿼리메소드를 위한 JPA Repository 입니다.
@Repository
public interface QueryRepository extends JpaRepository<Board, Long> {
    // 1. 위치기반 매개변수를 가지는 쿼리메소드
    //public abstract
    @Query("SELECT b FORM Board b WHERE b.title LIKE ?1 ESCAPE '/' ORDER BY b.id DESC") // JPQL
    List<Board> queryMethod_1(String pattern);

    @Query("SELECT b FORM Board b WHERE b.title LIKE ?1 ESCAPE '/' ORDER BY b.id DESC") // JPQL
    Page<Board> queryMethod_2(String pattern, Pageable paging);

    // 2. 이름기반 바인드 변수를 가지는 쿼리메소드
    //public abstract
    @Query("SELECT b FORM Board b WHERE b.title LIKE :titlePattern ESCAPE '/' ORDER BY b.id DESC") // JPQL
    List<Board> queryMethod_3(@Param("titlePattern") String pattern);

    @Query("SELECT b FORM Board b WHERE b.title LIKE :titlePattern ESCAPE '/' ORDER BY b.id DESC") // JPQL
    Page<Board> queryMethod_4(@Param("titlePattern") String pattern, Pageable paging);

    //----------------
    // WITH native SQL
    //----------------
//    public abstract
    @Query(value = "SELECT * FROM board WHERE create_date < :createDate", nativeQuery = true)
    Page<Board> queryMethod_5(Date createDate, Pageable paging);

    @Transactional
    @Modifying
    @Query(value = "UPDATE board SET cnt = ?1 WHERE board_id IN (:ids)", nativeQuery = true)
    int queryMethod_6(int updateCnt, long ... ids);
} // end interface
