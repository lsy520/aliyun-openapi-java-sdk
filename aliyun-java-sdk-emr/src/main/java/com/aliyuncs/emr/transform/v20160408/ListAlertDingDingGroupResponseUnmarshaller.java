/*
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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListAlertDingDingGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListAlertDingDingGroupResponse.AlertDingDingGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertDingDingGroupResponseUnmarshaller {

	public static ListAlertDingDingGroupResponse unmarshall(ListAlertDingDingGroupResponse listAlertDingDingGroupResponse, UnmarshallerContext context) {
		

		List<AlertDingDingGroup> alertDingDingGroupList = new ArrayList<AlertDingDingGroup>();
		for (int i = 0; i < context.lengthValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList.Length"); i++) {
			AlertDingDingGroup alertDingDingGroup = new AlertDingDingGroup();
			alertDingDingGroup.setId(context.longValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].Id"));
			alertDingDingGroup.setGmtCreate(context.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].GmtCreate"));
			alertDingDingGroup.setGmtModified(context.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].GmtModified"));
			alertDingDingGroup.setBizId(context.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].BizId"));
			alertDingDingGroup.setName(context.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].Name"));
			alertDingDingGroup.setDescription(context.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].Description"));
			alertDingDingGroup.setWebHookUrl(context.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].WebHookUrl"));

			alertDingDingGroupList.add(alertDingDingGroup);
		}
		listAlertDingDingGroupResponse.setAlertDingDingGroupList(alertDingDingGroupList);
	 
	 	return listAlertDingDingGroupResponse;
	}
}