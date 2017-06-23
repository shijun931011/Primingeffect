package com.demo.primingeffect.view;

import com.demo.primingeffect.bean.NavBean;

/**
 * Created by Administrator on 2017/6/23.
 */

public abstract class AbstractSubject<T> {
    public abstract void attachObserver(T observer);

    public abstract void detachObserver(T observer);

    public abstract void initTabData(NavBean[] navs);

    public abstract void refreshTabData(NavBean nav);

    public abstract void setSelectedType(@NavBean.TYPE int type);

    public abstract void setSelectedPosition(int position);
}
