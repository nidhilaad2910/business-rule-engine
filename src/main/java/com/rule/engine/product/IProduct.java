package com.rule.engine.product;

import com.rule.engine.enums.ACTION;
import com.rule.engine.enums.MODE;
import com.rule.engine.enums.TYPE;

public interface IProduct {

    public ACTION getAction();

    public void setAction(ACTION action);

    public MODE getMode();

    public void setMode(MODE mode);

    public TYPE getType();

    public void setType(TYPE type);

    public String getName();

    public void setName(String name);


}
