package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Booka;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest(){
        //
        MedianAdapter medianAdapter= new MedianAdapter();
        Set<Booka> books= new HashSet<>();
        books.add(new Booka("author1","title1",1994,"signature1"));
        books.add(new Booka("author2","title2",1997,"signature2"));
        books.add(new Booka("author3","title3",2010,"signature3"));
        //
        int median= medianAdapter.publicationYearMedian(books);
        //
        System.out.println(median);
        assertEquals(median,1997,0);
    }
}
