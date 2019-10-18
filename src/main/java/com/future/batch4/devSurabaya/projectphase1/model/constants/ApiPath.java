package com.future.batch4.devSurabaya.projectphase1.model.constants;

public class ApiPath {

    public static final String API = "/api";

    public static final String APPFEEDBACK = API + "/appfeedback";
    public static final String APPFEEDBACK_BY_ID =
            APPFEEDBACK + "/{appfeedbackId}";
    public static final String APPFEEDBACK_BY_TITLE =
            APPFEEDBACK + "/{title}";

    public static final String BOOK = API + "/book";
    public static final String BOOK_BY_ID =
            BOOK + "/{bookId}";

    public static final String BOOKCATEGORY = API + "/bookCategory";
    public static final String BOOKCATEGORY_BY_ID = BOOKCATEGORY + "/{bookCategoryId}";

    public static final String BOOKREPORT = API + "/bookreport";
    public static final String BOOKREPORT_BY_ID =
            BOOKREPORT + "/{bookreportId}";

    public static final String CART = API + "/cart";
    public static final String CART_BY_ID =
            CART + "/{cartId}";

    public static final String DETAILBOOKCATEGORY = API + "/dbc";
    public static final String DETAILBOOKCATEGORY_BY_ID =
            DETAILBOOKCATEGORY + "/{dbcId}";
    public static final String DETAILBOOKCATEGORY_BY_NAME =
            DETAILBOOKCATEGORY + "/{name}";

    public static final String DETAILTRANSACTION = API + "/detailTransaction";
    public static final String DETAILTRANSACTION_BY_ID =
            DETAILTRANSACTION + "/{detailTransactionId}";

    public static final String DETAILUSERQUESTION = API + "/detailUserQuestion";
    public static final String DETAILUSERQUESTION_BY_ID =
            DETAILUSERQUESTION + "/{detailUserQuestionId}";

    public static final String LASTREAD = API + "/lastRead";
    public static final String LASTREAD_BY_ID =
            LASTREAD + "/{lastReadId}";

    public static final String LIBRARY = API + "/library";
    public static final String LIBRARY_BY_ID =
            LIBRARY + "/{libraryId}";

    public static final String LIKE = API + "/like";
    public static final String LIKE_BY_ID =
            LIKE + "/{likeId}";

    public static final String REVIEW = API + "/review";
    public static final String REVIEW_BY_ID =
            REVIEW + "/{reviewId}";

    public static final String STORE = API + "/store";
    public static final String STORE_BY_ID =
            STORE + "/{storeId}";

    public static final String STOREREPORT = API + "/storeReport";
    public static final String STOREREPORT_BY_ID =
            STOREREPORT + "/{storeReportId}";

    public static final String TRANSACTION = API + "/transactions";
    public static final String TRANSACTION_BY_ID = TRANSACTION + "/{transactionId}";

    public static final String USER = API + "/user";
    public static final String USER_BY_ID =
            USER + "/{userId}";
    public static final String USER_BY_NAME =
            USER + "/{name}";

    public static final String USERQUESTION = API + "/userQuestion";
    public static final String USERQUESTION_BY_ID =
            USERQUESTION + "/{userQuestionId}";

    public static final String WISHLIST = API + "/wishlists";
    public static final String WISHLIST_BY_ID = WISHLIST + "/{wishlistId}";

    public static final String WRITER = API + "/writer";
    public static final String WRITER_BY_ID =
            WRITER + "/{writerId}";
    public static final String WRITER_BY_NAME =
            WRITER + "/{name}";
}
