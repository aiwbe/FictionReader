package com.shangame.fiction.ui.bookrack;

import com.shangame.fiction.core.base.BaseContract;
import com.shangame.fiction.net.response.AlbumChapterDetailResponse;
import com.shangame.fiction.net.response.BookRackResponse;
import com.shangame.fiction.net.response.RecommendBookResponse;

/**
 * Create by Speedy on 2018/8/22
 */
public interface BookRackContacts {

    interface View extends BaseContract.BaseView{
        void getBookListSuccess(BookRackResponse bookRackResponse);
        void getRecommendBookSuccess(RecommendBookResponse recommendBookResponse);

        void getAlbumChapterDetailSuccess(AlbumChapterDetailResponse response, int albumId, int cid);

        void getAlbumChapterDetailFailure(String msg);
    }

    interface Prestener<V> extends BaseContract.BaserPresenter<V>{
        void getBookList(int userid,int malechannel,int page,int pagesize);
        void getRecommendBook(long userid,int pagesize);

        void getAlbumChapterDetail(long userId, int albumId, int cid, String deviceId);
    }
}
