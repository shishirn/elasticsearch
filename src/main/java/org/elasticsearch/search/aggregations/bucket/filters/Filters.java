/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.search.aggregations.bucket.filters;

import org.elasticsearch.search.aggregations.bucket.MultiBucketsAggregation;

import java.util.List;

/**
 * A multi bucket aggregation where the buckets are defined by a set of filters (a bucket per filter). Each bucket
 * will collect all documents matching its filter.
 */
public interface Filters extends MultiBucketsAggregation {

    /**
     * A bucket associated with a specific filter (identified by its key)
     */
    public static interface Bucket extends MultiBucketsAggregation.Bucket {
    }

    /**
     * The buckets created by this aggregation.
     */
    List<? extends Bucket> getBuckets();

    Bucket getBucketByKey(String key);

}
