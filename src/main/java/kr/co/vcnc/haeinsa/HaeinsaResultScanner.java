package kr.co.vcnc.haeinsa;

import java.io.Closeable;
import java.io.IOException;

public interface HaeinsaResultScanner extends Closeable, Iterable<HaeinsaResult> {
	
	/**
	   * Grab the next row's worth of values. The scanner will return a Result.
	   * @return Result object if there is another row, null if the scanner is
	   * exhausted.
	   * @throws IOException e
	   */
	  public HaeinsaResult next() throws IOException;

	  /**
	   * @param nbRows number of rows to return
	   * @return Between zero and <param>nbRows</param> Results
	   * @throws IOException e
	   */
	  public HaeinsaResult [] next(int nbRows) throws IOException;

	  /**
	   * Closes the scanner and releases any resources it has allocated
	   */
	  public void close();

}