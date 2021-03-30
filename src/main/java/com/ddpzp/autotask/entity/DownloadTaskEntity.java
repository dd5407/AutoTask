package com.ddpzp.autotask.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 下载任务
 * Created by dd
 * Date 2021/3/30 23:03
 */
@Data
@ToString
@Entity
public class DownloadTaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String scheduleType;
    @Column
    private String scheduleTime;
    @Column
    private Date createTime;
    @Column
    private Date updateTime;
    @Column
    private Date lastRunTime;
}

