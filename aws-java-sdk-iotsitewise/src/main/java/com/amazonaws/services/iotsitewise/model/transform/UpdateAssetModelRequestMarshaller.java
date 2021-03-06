/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotsitewise.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotsitewise.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateAssetModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateAssetModelRequestMarshaller {

    private static final MarshallingInfo<String> ASSETMODELID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PATH)
            .marshallLocationName("assetModelId").build();
    private static final MarshallingInfo<String> ASSETMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelName").build();
    private static final MarshallingInfo<String> ASSETMODELDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelDescription").build();
    private static final MarshallingInfo<List> ASSETMODELPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelProperties").build();
    private static final MarshallingInfo<List> ASSETMODELHIERARCHIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assetModelHierarchies").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final UpdateAssetModelRequestMarshaller instance = new UpdateAssetModelRequestMarshaller();

    public static UpdateAssetModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateAssetModelRequest updateAssetModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateAssetModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateAssetModelRequest.getAssetModelId(), ASSETMODELID_BINDING);
            protocolMarshaller.marshall(updateAssetModelRequest.getAssetModelName(), ASSETMODELNAME_BINDING);
            protocolMarshaller.marshall(updateAssetModelRequest.getAssetModelDescription(), ASSETMODELDESCRIPTION_BINDING);
            protocolMarshaller.marshall(updateAssetModelRequest.getAssetModelProperties(), ASSETMODELPROPERTIES_BINDING);
            protocolMarshaller.marshall(updateAssetModelRequest.getAssetModelHierarchies(), ASSETMODELHIERARCHIES_BINDING);
            protocolMarshaller.marshall(updateAssetModelRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
