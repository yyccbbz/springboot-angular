package com.app.model.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 *
 * 分页bean
 *
 */
public class PageResponse extends OperationResponse {

    //是否首页
    @Getter
    @Setter
    private boolean first;

    //是否末页
    @Getter
    @Setter
    private boolean last;

    //当前页码
    @Getter
    @Setter
    private int currentPageNumber;

    //数据所在页
    @Getter
    @Setter
    private int itemsInPage;

    //页面大小
    @Getter
    @Setter
    private int pageSize;

    //总页码
    @Getter
    @Setter
    private int totalPages;

    //数据总条数
    @Getter
    @Setter
    private long totalItems;

    //排序
    @Getter
    @Setter
    private Sort sort;

    //数据列表
    private List items;

    public void setPageStats(Page pg, boolean setDefaultMessage) {
        this.first = pg.isFirst();
        this.last = pg.isLast();
        this.currentPageNumber = pg.getNumber();
        this.itemsInPage = pg.getNumberOfElements();
        this.pageSize = pg.getSize();
        this.totalPages = pg.getTotalPages();
        this.totalItems = pg.getTotalElements();
        //this.items = pg.getContent();
        this.sort = pg.getSort();
        if (setDefaultMessage == true) {
            this.setOperationStatus(ResponseStatusEnum.SUCCESS);
            this.setOperationMessage("Page " + (pg.getNumber() + 1) + " of " + pg.getTotalPages());
        }
    }

    public void setPageTotal(int count, boolean setDefaultMessage) {
        //this.items = list;
        this.first = true;
        this.last = true;
        this.itemsInPage = count;
        this.totalItems = count;
        this.totalPages = 1;
        this.pageSize = count;
        if (setDefaultMessage == true) {
            this.setOperationStatus(ResponseStatusEnum.SUCCESS);
            this.setOperationMessage("Total " + count + " items ");
        }
    }

}
