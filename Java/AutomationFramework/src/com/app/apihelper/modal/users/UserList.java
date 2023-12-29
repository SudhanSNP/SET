package com.app.apihelper.modal.users;

import java.util.List;

public class UserList {
    private int page;
    private int per_page;
    private int total;
    private int total_pages;
    private List<UserData> data;
    private UserSupport support;


    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public List<UserData> getData() {
        return data;
    }

    public void setData(List<UserData> usersData) {
        this.data = usersData;
    }

    public UserSupport getSupport() {
        return support;
    }

    public void setSupport(UserSupport support) {
        this.support = support;
    }
}
