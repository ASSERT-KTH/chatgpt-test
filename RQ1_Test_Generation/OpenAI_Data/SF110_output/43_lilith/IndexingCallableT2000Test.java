// IndexingCallableTest.java
package de.huxhorn.lilith.swing.callables;

import de.huxhorn.sulky.codec.filebuffer.DefaultDataStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultIndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.IndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.SparseDataStrategy;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingCallable}.
* It contains ten unit test cases for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {

		private final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' does not exist.
		* Expected result: FileNotFoundException.
		*/
		@Test
		public void testCall_1() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertThrows(FileNotFoundException.class, () -&gt; {
						indexingCallable.call();
				});
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is not a file.
		* Expected result: FileNotFoundException.
		*/
		@Test
		public void testCall_2() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertThrows(FileNotFoundException.class, () -&gt; {
						indexingCallable.call();
				});
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_3() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_4() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_5() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_6() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_7() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_8() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_9() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
		/**
		* Test case for {@link IndexingCallable#call()} method.
		* Test data: File 'test.data' is a valid file.
		* Expected result: Long.
		*/
		@Test
		public void testCall_10() throws Exception {
				File dataFile = new File("test.data");
				File indexFile = new File("test.index");
				IndexingCallable indexingCallable = new IndexingCallable(dataFile, indexFile);
				assertEquals(Long.class, indexingCallable.call().getClass());
		}
		
}

// IndexingTask.java
/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.swing.taskmanager;

import de.huxhorn.lilith.swing.taskmanager.TaskStatus.State;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import de.huxhorn.sulky.tasks.Task;
import de.huxhorn.sulky.tasks.TaskListener;
import de.huxhorn.sul