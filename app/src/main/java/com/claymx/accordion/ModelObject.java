package com.claymx.accordion;


public  enum ModelObject {


    CRICKET(R.string.cricket, R.layout.view_cricket),
    FIGHTER(R.string.fighter, R.layout.view_fighter),
    FOOTBALL(R.string.football, R.layout.view_football),
    LUDO(R.string.ludo, R.layout.view_ludo),
    POKEMON(R.string.pokemon, R.layout.view_pokemon),
    TEMPLERUN(R.string.templerun, R.layout.view_templerun);


    private int mTitleResId;
    private int mLayoutResId;


    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}

