/*
 *  Copyright (C) 2016 Alessandro Yuichi Okimoto
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Contact email: alessandro@alessandro.jp
 */

package jp.alessandro.android.iab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PurchaseList {

    private final Map<String, Purchase> mMap = new LinkedHashMap<>();

    public PurchaseList() {
    }

    public boolean hasItemId(String itemId) {
        return mMap.containsKey(itemId);
    }

    public List<Purchase> getAll() {
        return new ArrayList<>(mMap.values());
    }

    public Purchase getByPurchaseId(String itemId) {
        return mMap.get(itemId);
    }

    public int size() {
        return mMap.size();
    }

    void put(Purchase purchase) {
        mMap.put(purchase.getSku(), purchase);
    }
}