package com.shangame.fiction.ui.reader.local.page;

import android.support.annotation.ColorRes;

import com.shangame.fiction.R;

/**
 * 作用：页面的展示风格。
 */
public enum PageStyle {
    BG_0(R.color.read_font_1, R.color.read_bg_1),
    BG_1(R.color.read_font_2, R.color.read_bg_2),
    BG_2(R.color.read_font_3, R.color.read_bg_3),
    BG_3(R.color.read_font_4, R.color.read_bg_4),
    BG_4(R.color.read_font_5, R.color.read_bg_5),
    NIGHT(R.color.read_font_night, R.color.night_color),;

    private int fontColor;
    private int bgColor;

    PageStyle(@ColorRes int fontColor, @ColorRes int bgColor) {
        this.fontColor = fontColor;
        this.bgColor = bgColor;
    }

    public int getFontColor() {
        return fontColor;
    }

    public int getBgColor() {
        return bgColor;
    }
}
