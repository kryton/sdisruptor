/*
 * Copyright 2011 LMAX Ltd., modified by Jamie Allen to use Scala port.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lmax.disruptor.support;

import com.jamieallen.sdisruptor.AbstractEntry;
import com.jamieallen.sdisruptor.EntryFactory;

public final class ValueEntry extends AbstractEntry
{
    private long value;

    public long getValue()
    {
        return value;
    }

    public void setValue(final long value)
    {
        this.value = value;
    }

    public final static EntryFactory<ValueEntry> ENTRY_FACTORY = new EntryFactory<ValueEntry>()
    {
        public ValueEntry create()
        {
            return new ValueEntry();
        }
    };
}
