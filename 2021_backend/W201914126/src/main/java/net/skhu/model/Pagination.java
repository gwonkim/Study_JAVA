package net.skhu.model;

import lombok.Data;

@Data
public class Pagination {
    int pg = 1;
    int sz = 15;
    int ci = 0;
    int recordCount;

    public String getQueryString() {
        return String.format("pg=%d&sz=%d&ci=%d", pg, sz, ci);
    }
}
