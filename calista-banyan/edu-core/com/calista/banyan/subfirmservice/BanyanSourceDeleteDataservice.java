/*****************************************************************
   Copyright 2020 by Hien Nguyen (hiennguyen@inetcloud.vn)

   Licensed under the iNet Solutions Corp.,;
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.inetcloud.vn/licenses

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 *****************************************************************/
package com.calista.banyan.subfirmservice;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.shiro.util.StringUtils;

import com.calista.banyan.BanyanConstant;
import com.inet.calista.global.bo.GlbSourceBO;
import com.inet.calista.global.model.GlbSource;
import com.inet.xportal.module.web.plugin.dataservice.PluginSubfirmAbstraction;
import com.inet.xportal.nosql.web.data.SearchDTO;
import com.inet.xportal.nosql.web.model.SiteDataModel;
import com.inet.xportal.nosql.web.model.SubFirmProfile;
import com.inet.xportal.web.WebConstant;
import com.inet.xportal.web.action.AbstractBaseAction;
import com.inet.xportal.web.annotation.XPortalDataService;
import com.inet.xportal.web.annotation.XPortalPageRequest;
import com.inet.xportal.web.exception.WebOSBOException;
import com.inet.xportal.web.interfaces.ObjectWebDataservice;
import com.inet.xportal.web.interfaces.WebDataService;
import com.inet.xportal.web.util.XParamUtils;
import com.inet.xportal.xdb.persistence.JSONDB;
import com.inet.xportal.xdb.query.Query;
import com.inet.xportal.xdb.query.impl.QueryImpl;

/**
 * 
 * BanyanSourceDeleteDataservice.
 *
 * @author Hien Nguyen
 * @version $Id: BanyanSourceDeleteDataservice.java Oct 13, 2020 4:09:44 PM nguyen_dv $
 *
 * @since 1.0
 */
@Named("banyansourcedelete")
@XPortalDataService(roles={BanyanConstant.ROLE_ADMIN}, description="Banyan Source service")
@XPortalPageRequest(uri="banyan/source/delete", 
	inherit = true,
	transaction = true,
	result = WebConstant.ACTION_XSTREAM_JSON_RESULT)
public class BanyanSourceDeleteDataservice extends PluginSubfirmAbstraction {
	@Inject
	private GlbSourceBO sourceBO;
	/*
	 * After account was created, payment process will be created
	 * (non-Javadoc)
	 * @see com.inet.xportal.nosql.web.dataservice.UserCreateAbstraction#service(com.inet.xportal.common.profile.BaseUserModel, java.lang.Object, com.inet.xportal.web.action.AbstractBaseAction, java.util.Map)
	 */
	@Override
	protected WebDataService service(final SiteDataModel site,
			final SubFirmProfile firm, 
			final AbstractBaseAction action, 
			final Map<String, Object> params) throws WebOSBOException
	{
		return new ObjectWebDataservice<>();
	}
}
