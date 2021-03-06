/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

public final class EnvironmentProto {
  private EnvironmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_VersionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_VersionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEnvironmentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEnvironmentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/dialogflow/cx/v3beta1/env"
          + "ironment.proto\022\"google.cloud.dialogflow."
          + "cx.v3beta1\032\034google/api/annotations.proto"
          + "\032\027google/api/client.proto\032\037google/api/fi"
          + "eld_behavior.proto\032\031google/api/resource."
          + "proto\032#google/longrunning/operations.pro"
          + "to\032\033google/protobuf/empty.proto\032 google/"
          + "protobuf/field_mask.proto\032\037google/protob"
          + "uf/timestamp.proto\"\252\003\n\013Environment\022\014\n\004na"
          + "me\030\001 \001(\t\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013d"
          + "escription\030\003 \001(\t\022[\n\017version_configs\030\006 \003("
          + "\0132=.google.cloud.dialogflow.cx.v3beta1.E"
          + "nvironment.VersionConfigB\003\340A\002\0224\n\013update_"
          + "time\030\005 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\032K\n\rVersionConfig\022:\n\007version\030\001 \001(\tB)\340"
          + "A\002\372A#\n!dialogflow.googleapis.com/Version"
          + ":}\352Az\n%dialogflow.googleapis.com/Environ"
          + "ment\022Qprojects/{project}/locations/{loca"
          + "tion}/agents/{agent}/environments/{envir"
          + "onment}\"\177\n\027ListEnvironmentsRequest\022=\n\006pa"
          + "rent\030\001 \001(\tB-\340A\002\372A\'\022%dialogflow.googleapi"
          + "s.com/Environment\022\021\n\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"z\n\030ListEnvironmentsResp"
          + "onse\022E\n\014environments\030\001 \003(\0132/.google.clou"
          + "d.dialogflow.cx.v3beta1.Environment\022\027\n\017n"
          + "ext_page_token\030\002 \001(\t\"T\n\025GetEnvironmentRe"
          + "quest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%dialogflow."
          + "googleapis.com/Environment\"\244\001\n\030CreateEnv"
          + "ironmentRequest\022=\n\006parent\030\001 \001(\tB-\340A\002\372A\'\022"
          + "%dialogflow.googleapis.com/Environment\022I"
          + "\n\013environment\030\002 \001(\0132/.google.cloud.dialo"
          + "gflow.cx.v3beta1.EnvironmentB\003\340A\002\"\233\001\n\030Up"
          + "dateEnvironmentRequest\022I\n\013environment\030\001 "
          + "\001(\0132/.google.cloud.dialogflow.cx.v3beta1"
          + ".EnvironmentB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032"
          + ".google.protobuf.FieldMaskB\003\340A\002\"W\n\030Delet"
          + "eEnvironmentRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A"
          + "\'\n%dialogflow.googleapis.com/Environment"
          + "\"\205\001\n\037LookupEnvironmentHistoryRequest\022;\n\004"
          + "name\030\001 \001(\tB-\340A\002\372A\'\n%dialogflow.googleapi"
          + "s.com/Environment\022\021\n\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"\202\001\n LookupEnvironmentHi"
          + "storyResponse\022E\n\014environments\030\001 \003(\0132/.go"
          + "ogle.cloud.dialogflow.cx.v3beta1.Environ"
          + "ment\022\027\n\017next_page_token\030\002 \001(\t2\237\014\n\014Enviro"
          + "nments\022\336\001\n\020ListEnvironments\022;.google.clo"
          + "ud.dialogflow.cx.v3beta1.ListEnvironment"
          + "sRequest\032<.google.cloud.dialogflow.cx.v3"
          + "beta1.ListEnvironmentsResponse\"O\202\323\344\223\002@\022>"
          + "/v3beta1/{parent=projects/*/locations/*/"
          + "agents/*}/environments\332A\006parent\022\313\001\n\016GetE"
          + "nvironment\0229.google.cloud.dialogflow.cx."
          + "v3beta1.GetEnvironmentRequest\032/.google.c"
          + "loud.dialogflow.cx.v3beta1.Environment\"M"
          + "\202\323\344\223\002@\022>/v3beta1/{name=projects/*/locati"
          + "ons/*/agents/*/environments/*}\332A\004name\022\203\002"
          + "\n\021CreateEnvironment\022<.google.cloud.dialo"
          + "gflow.cx.v3beta1.CreateEnvironmentReques"
          + "t\032\035.google.longrunning.Operation\"\220\001\202\323\344\223\002"
          + "M\">/v3beta1/{parent=projects/*/locations"
          + "/*/agents/*}/environments:\013environment\332A"
          + "\022parent,environment\312A%\n\013Environment\022\026goo"
          + "gle.protobuf.Struct\022\224\002\n\021UpdateEnvironmen"
          + "t\022<.google.cloud.dialogflow.cx.v3beta1.U"
          + "pdateEnvironmentRequest\032\035.google.longrun"
          + "ning.Operation\"\241\001\202\323\344\223\002Y2J/v3beta1/{envir"
          + "onment.name=projects/*/locations/*/agent"
          + "s/*/environments/*}:\013environment\332A\027envir"
          + "onment,update_mask\312A%\n\013Environment\022\026goog"
          + "le.protobuf.Struct\022\270\001\n\021DeleteEnvironment"
          + "\022<.google.cloud.dialogflow.cx.v3beta1.De"
          + "leteEnvironmentRequest\032\026.google.protobuf"
          + ".Empty\"M\202\323\344\223\002@*>/v3beta1/{name=projects/"
          + "*/locations/*/agents/*/environments/*}\332A"
          + "\004name\022\215\002\n\030LookupEnvironmentHistory\022C.goo"
          + "gle.cloud.dialogflow.cx.v3beta1.LookupEn"
          + "vironmentHistoryRequest\032D.google.cloud.d"
          + "ialogflow.cx.v3beta1.LookupEnvironmentHi"
          + "storyResponse\"f\202\323\344\223\002Y\022W/v3beta1/{name=pr"
          + "ojects/*/locations/*/agents/*/environmen"
          + "ts/*}:lookupEnvironmentHistory\332A\004name\032x\312"
          + "A\031dialogflow.googleapis.com\322AYhttps://ww"
          + "w.googleapis.com/auth/cloud-platform,htt"
          + "ps://www.googleapis.com/auth/dialogflowB"
          + "\257\001\n&com.google.cloud.dialogflow.cx.v3bet"
          + "a1B\020EnvironmentProtoP\001ZDgoogle.golang.or"
          + "g/genproto/googleapis/cloud/dialogflow/c"
          + "x/v3beta1;cx\370\001\001\242\002\002DF\252\002\"Google.Cloud.Dial"
          + "ogflow.Cx.V3Beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "Description", "VersionConfigs", "UpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_VersionConfig_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_VersionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Environment_VersionConfig_descriptor,
            new java.lang.String[] {
              "Version",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListEnvironmentsResponse_descriptor,
            new java.lang.String[] {
              "Environments", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Environment",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Environment", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEnvironmentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEnvironmentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteEnvironmentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_LookupEnvironmentHistoryResponse_descriptor,
            new java.lang.String[] {
              "Environments", "NextPageToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
