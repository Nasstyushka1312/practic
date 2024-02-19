/**

 Представляет собой станцию типа MR-231. */
package org.example.searadar.mr231.station;

import org.apache.mina.filter.codec.textline.LineDelimiter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;

import org.example.searadar.mr231.convert.Mr231Converter;
import ru.oogis.searadar.api.convert.SearadarExchangeConverter;
import ru.oogis.searadar.api.station.AbstractStationType;

import java.nio.charset.Charset;

public class Mr231StationType {

    private static final String STATION_TYPE = "МР-231";
    private static final String CODEC_NAME = "mr231";

    /**
     * Инициализирует тип станции MR-231 путем создания фабрики кодеков текстовых строк.
     */
    protected void doInitialize() {
        TextLineCodecFactory textLineCodecFactory = new TextLineCodecFactory(
                Charset.defaultCharset(),
                LineDelimiter.UNIX,
                LineDelimiter.CRLF
        );

    }

    // Дополнительная логика инициализации, если это необходимо
    /**
     * Создает новый преобразователь MR-231.
     *
     * @возвращает преобразователь MR-231.
     */
    public Mr231Converter createConverter() {
        return new Mr231Converter();
    }
}
