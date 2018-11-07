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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeFlowNodeInstanceContainerLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowNodeInstanceContainerLogResponse extends AcsResponse {

	private String requestId;

	private Boolean logEnd;

	private List<LogEntry> logEntrys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getLogEnd() {
		return this.logEnd;
	}

	public void setLogEnd(Boolean logEnd) {
		this.logEnd = logEnd;
	}

	public List<LogEntry> getLogEntrys() {
		return this.logEntrys;
	}

	public void setLogEntrys(List<LogEntry> logEntrys) {
		this.logEntrys = logEntrys;
	}

	public static class LogEntry {

		private String content;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public DescribeFlowNodeInstanceContainerLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowNodeInstanceContainerLogResponseUnmarshaller.unmarshall(this, context);
	}
}
