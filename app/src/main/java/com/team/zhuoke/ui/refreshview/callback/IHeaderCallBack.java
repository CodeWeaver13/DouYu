package com.team.zhuoke.ui.refreshview.callback;


/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：16/10/26 下午1:29
 **/

/**
 * 提供自定义headerview的接口
 *
 */
public interface IHeaderCallBack {
    /**
     * 正常状态
     */
    public void onStateNormal();

    /**
     * 准备刷新
     */
    public void onStateReady();

    /**
     * 正在刷新
     */
    public void onStateRefreshing();

    /**
     * 刷新结束
     *
     * @param success 是否刷新成功 success参数由XRefreshView.stopRefresh(boolean)传入
     */
    public void onStateFinish(boolean success);

    /**
     * 获取headerview显示的高度与headerview高度的比例
     *
     * @param headerMovePercent  移动距离和headerview高度的比例
     * @param offsetY headerview移动的距离
     */
    public void onHeaderMove(double headerMovePercent, int offsetY, int deltaY);

    /**
     * 设置显示上一次刷新的时间
     *
     * @param lastRefreshTime 上一次刷新的时间
     */
    public void setRefreshTime(long lastRefreshTime);

    /**
     * 隐藏footerview
     */
    public void hide();

    /**
     * 显示footerview
     */
    public void show();

    /**
     * 获得headerview的高度,如果不想headerview全部被隐藏，就可以只返回一部分的高度
     *
     * @return
     */
    public int getHeaderHeight();
}