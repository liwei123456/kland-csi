package com.kland.csi.db.dao;

import com.kland.csi.db.domain.Sample;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xiangli.
 */
@Repository
@Transactional
public interface SampleDao {
    public Sample get(long id);
    public int insert(Sample sample);
    public int update(Sample sample);
    public int deleteById(long id);
}
