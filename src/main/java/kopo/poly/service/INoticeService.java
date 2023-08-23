package kopo.poly.service;

import kopo.poly.dto.NoticeDTO;

import java.util.List;

public interface INoticeService {

    /**
     * 공지사항 전체 가져오기
     */
    List<NoticeDTO> getNoticeList();

    /**
     * 공지사항 상세 정보가져오기
     *
     * @Param pDTO 공지
     */
}
