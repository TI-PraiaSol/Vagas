package br.com.praiasol.apivagas.to;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@SuppressWarnings("serial")
@EqualsAndHashCode(callSuper = false)
public class CustomExceptionTO extends Throwable{

  private Integer code;
  private Integer httpStatus = 500;
  private String message;
  private List<String> errors;

  public CustomExceptionTO(Integer code, String message) {
    this.code = code;
    this.message = message;
  }

  public CustomExceptionTO(Integer code, Integer httpStatus) {
    this.code = code;
    this.httpStatus = httpStatus;
  }

  public CustomExceptionTO(Integer code, Integer httpStatus, String message) {
    this.code = code;
    this.httpStatus = httpStatus;
    this.message = message;
  }

}
