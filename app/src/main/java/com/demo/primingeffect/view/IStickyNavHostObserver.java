package com.demo.primingeffect.view;

import com.demo.primingeffect.bean.NavBean;

/**
 * Created by Administrator on 2017/6/23.
 */

public interface IStickyNavHostObserver {
    void initTabData(NavBean[] navs);

    void refreshTabData(NavBean nav);

    void setSelectedType(@NavBean.TYPE int type);

    void setSelectedPosition(int position);

}
