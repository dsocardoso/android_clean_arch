package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.interactors.AddBookmark
import com.raywenderlich.android.majesticreader.interactors.AddDocument
import com.raywenderlich.android.majesticreader.interactors.GetBookmarks
import com.raywenderlich.android.majesticreader.interactors.GetDocuments
import com.raywenderlich.android.majesticreader.interactors.GetOpenDocument
import com.raywenderlich.android.majesticreader.interactors.RemoveBookmark
import com.raywenderlich.android.majesticreader.interactors.RemoveDocument
import com.raywenderlich.android.majesticreader.interactors.SetOpenDocument

class Interactors(
    val addBookmark: AddBookmark,
    val getBookmarks: GetBookmarks,
    val deleteBookmark: RemoveBookmark,
    val addDocument: AddDocument,
    val getDocuments: GetDocuments,
    val removeDocument: RemoveDocument,
    val getOpenDocument: GetOpenDocument,
    val setOpenDocument: SetOpenDocument
)