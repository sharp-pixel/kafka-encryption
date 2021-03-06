/*-
 * #%L
 * Kafka Encryption
 * %%
 * Copyright (C) 2018 Quicksign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.quicksign.kafka.crypto.pairing.serializer;

import org.apache.kafka.common.serialization.Serializer;

/**
 * Represent paired {@link Serializer}
 * @param <K>
 * @param <V>
 */
public class SerializerPair<K, V> {

    private final Serializer<K> keySerializer;
    private final Serializer<V> valueSerializer;

    public SerializerPair(Serializer<K> keySerializer, Serializer<V> valueSerializer) {

        this.keySerializer = keySerializer;
        this.valueSerializer = valueSerializer;
    }

    public Serializer<K> getKeySerializer() {
        return keySerializer;
    }

    public Serializer<V> getValueSerializer() {
        return valueSerializer;
    }
}
