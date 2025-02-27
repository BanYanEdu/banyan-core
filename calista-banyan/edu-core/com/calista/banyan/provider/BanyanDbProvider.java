/*****************************************************************
   Copyright 2013 by Duyen Tang (tttduyen@inetcloud.vn)

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
package com.calista.banyan.provider;

import javax.inject.Inject;
import javax.inject.Named;

import com.inet.xportal.nosql.web.provider.CloudConfigAbstraction;
import com.inet.xportal.nosql.web.provider.NoSQLConfigProviderAbstraction;
import com.inet.xportal.web.annotation.XPortalBigData;
import com.inet.xportal.web.context.ApplicationContext;

/**
 * 
 * BanyanDbProvider.
 *
 * @author Hien Nguyen
 * @version $Id: BanyanDbProvider.java Oct 13, 2020 12:00:58 PM nguyen_dv $
 *
 * @since 1.0
 */
@ApplicationContext(context = "BanyanProvider")
@XPortalBigData(context = "banyan_database")
@Named("BanyanDbProvider")
public class BanyanDbProvider extends NoSQLConfigProviderAbstraction {
  /*
   * 
   */
  @Inject
  protected BanyanDbProvider(@ApplicationContext(context ="BanyanConfig") CloudConfigAbstraction cloudCfg) {
    super(cloudCfg);
  }

  /*
   * (non-Javadoc)
   * @see com.inet.xportal.nosql.web.provider.NoSQLConfigProvider#contextEnabled()
   */
  @Override
  public boolean contextEnabled() {
    return false;
  }
}
