/**

 Этот класс представляет тип станции MR-231_3.
 Он предоставляет методы для инициализации и создания преобразователя для станции. */
package org.example.searadar.mr231.station;

import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.example.searadar.mr231.convert.Mr231_3Converter;

import java.nio.charset.Charset;

public class Mr231_3StationType {

    private static final String STATION_TYPE = "МР-231_3";
    private static final String CODEC_NAME = "mr231_3";

    /**
     * Инициализирует тип станции MR-231_3.
     * Он устанавливает фабрику кодеков текстовых строк с кодировкой по умолчанию, разделителем строк UNIX и разделителем строк CRLF.
     */
    protected void doInitialize() {
        TextLineCodecFactory textLineCodecFactory = new TextLineCodecFactory(
                Charset.defaultCharset(),
                LineDelimiter.UNIX,
                LineDelimiter.CRLF
        );

    }

    /**
     * Создает преобразователь для типа станции MR-231_3.
     * @возвращает преобразователь MR-231_3
     */
    public Mr231_3Converter createConverter() {
        return new Mr231_3Converter();
    }
}
