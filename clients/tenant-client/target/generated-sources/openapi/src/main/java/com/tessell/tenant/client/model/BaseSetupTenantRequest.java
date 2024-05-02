/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.tenant.client.model.CloudType;
import com.tessell.tenant.client.model.ConvoyDeploymentConfig;
import com.tessell.tenant.client.model.CustomerType;
import com.tessell.tenant.client.model.DedicatedCloudAccount;
import com.tessell.tenant.client.model.Discount;
import com.tessell.tenant.client.model.InfraDeploymentSetupConfig;
import com.tessell.tenant.client.model.SetupTenantBillingConfig;
import com.tessell.tenant.client.model.SetupTenantGenieConfig;
import com.tessell.tenant.client.model.TenantPhase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * BaseSetupTenantRequest
 */
@JsonPropertyOrder({
  BaseSetupTenantRequest.JSON_PROPERTY_EMAIL_ID,
  BaseSetupTenantRequest.JSON_PROPERTY_INITIAL_CREDITS,
  BaseSetupTenantRequest.JSON_PROPERTY_DISCOUNT,
  BaseSetupTenantRequest.JSON_PROPERTY_SUPPORT_PLAN,
  BaseSetupTenantRequest.JSON_PROPERTY_BILLING_DISABLED,
  BaseSetupTenantRequest.JSON_PROPERTY_BILLING_CONFIG,
  BaseSetupTenantRequest.JSON_PROPERTY_GENIE_CONFIG,
  BaseSetupTenantRequest.JSON_PROPERTY_FIRST_NAME,
  BaseSetupTenantRequest.JSON_PROPERTY_LAST_NAME,
  BaseSetupTenantRequest.JSON_PROPERTY_COMPANY,
  BaseSetupTenantRequest.JSON_PROPERTY_JOB_TITLE,
  BaseSetupTenantRequest.JSON_PROPERTY_COUNTRY,
  BaseSetupTenantRequest.JSON_PROPERTY_DOMAIN,
  BaseSetupTenantRequest.JSON_PROPERTY_CUSTOMER_TYPE,
  BaseSetupTenantRequest.JSON_PROPERTY_DELETE_PROTECTED,
  BaseSetupTenantRequest.JSON_PROPERTY_DEPLOYMENT_CONFIG,
  BaseSetupTenantRequest.JSON_PROPERTY_CONVOY_DEPLOYMENT_CONFIG,
  BaseSetupTenantRequest.JSON_PROPERTY_ENABLED_CLOUDS,
  BaseSetupTenantRequest.JSON_PROPERTY_DEDICATED_CLOUD_ACCOUNTS,
  BaseSetupTenantRequest.JSON_PROPERTY_TENANT_PHASE
})
@JsonTypeName("BaseSetupTenantRequest")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseSetupTenantRequest {
  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_INITIAL_CREDITS = "initialCredits";
  private Double initialCredits;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private Discount discount;

  public static final String JSON_PROPERTY_SUPPORT_PLAN = "supportPlan";
  private String supportPlan;

  public static final String JSON_PROPERTY_BILLING_DISABLED = "billingDisabled";
  private Boolean billingDisabled = false;

  public static final String JSON_PROPERTY_BILLING_CONFIG = "billingConfig";
  private SetupTenantBillingConfig billingConfig;

  public static final String JSON_PROPERTY_GENIE_CONFIG = "genieConfig";
  private SetupTenantGenieConfig genieConfig;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private String company;

  public static final String JSON_PROPERTY_JOB_TITLE = "jobTitle";
  private String jobTitle;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_DOMAIN = "domain";
  private String domain;

  public static final String JSON_PROPERTY_CUSTOMER_TYPE = "customerType";
  private CustomerType customerType;

  public static final String JSON_PROPERTY_DELETE_PROTECTED = "deleteProtected";
  private Boolean deleteProtected = false;

  public static final String JSON_PROPERTY_DEPLOYMENT_CONFIG = "deploymentConfig";
  private InfraDeploymentSetupConfig deploymentConfig;

  public static final String JSON_PROPERTY_CONVOY_DEPLOYMENT_CONFIG = "convoyDeploymentConfig";
  private ConvoyDeploymentConfig convoyDeploymentConfig;

  public static final String JSON_PROPERTY_ENABLED_CLOUDS = "enabledClouds";
  private List<CloudType> enabledClouds = new ArrayList<>();

  public static final String JSON_PROPERTY_DEDICATED_CLOUD_ACCOUNTS = "dedicatedCloudAccounts";
  private List<DedicatedCloudAccount> dedicatedCloudAccounts = null;

  public static final String JSON_PROPERTY_TENANT_PHASE = "tenantPhase";
  private TenantPhase tenantPhase = TenantPhase.LIVE;


  public BaseSetupTenantRequest emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Tenant user&#39;s email address
   * @return emailId
  **/
  @ApiModelProperty(required = true, value = "Tenant user's email address")
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailId() {
    return emailId;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }


  public BaseSetupTenantRequest initialCredits(Double initialCredits) {
    
    this.initialCredits = initialCredits;
    return this;
  }

   /**
   * Override the initial default credits
   * @return initialCredits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the initial default credits")
  @JsonProperty(JSON_PROPERTY_INITIAL_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getInitialCredits() {
    return initialCredits;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_CREDITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialCredits(Double initialCredits) {
    this.initialCredits = initialCredits;
  }


  public BaseSetupTenantRequest discount(Discount discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Discount getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(Discount discount) {
    this.discount = discount;
  }


  public BaseSetupTenantRequest supportPlan(String supportPlan) {
    
    this.supportPlan = supportPlan;
    return this;
  }

   /**
   * Override the default support plan for the tenant
   * @return supportPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Override the default support plan for the tenant")
  @JsonProperty(JSON_PROPERTY_SUPPORT_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSupportPlan() {
    return supportPlan;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORT_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportPlan(String supportPlan) {
    this.supportPlan = supportPlan;
  }


  public BaseSetupTenantRequest billingDisabled(Boolean billingDisabled) {
    
    this.billingDisabled = billingDisabled;
    return this;
  }

   /**
   * To be deprecated
   * @return billingDisabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To be deprecated")
  @JsonProperty(JSON_PROPERTY_BILLING_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBillingDisabled() {
    return billingDisabled;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingDisabled(Boolean billingDisabled) {
    this.billingDisabled = billingDisabled;
  }


  public BaseSetupTenantRequest billingConfig(SetupTenantBillingConfig billingConfig) {
    
    this.billingConfig = billingConfig;
    return this;
  }

   /**
   * Get billingConfig
   * @return billingConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BILLING_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetupTenantBillingConfig getBillingConfig() {
    return billingConfig;
  }


  @JsonProperty(JSON_PROPERTY_BILLING_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBillingConfig(SetupTenantBillingConfig billingConfig) {
    this.billingConfig = billingConfig;
  }


  public BaseSetupTenantRequest genieConfig(SetupTenantGenieConfig genieConfig) {
    
    this.genieConfig = genieConfig;
    return this;
  }

   /**
   * Get genieConfig
   * @return genieConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENIE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SetupTenantGenieConfig getGenieConfig() {
    return genieConfig;
  }


  @JsonProperty(JSON_PROPERTY_GENIE_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGenieConfig(SetupTenantGenieConfig genieConfig) {
    this.genieConfig = genieConfig;
  }


  public BaseSetupTenantRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Tenant user&#39;s first name
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant user's first name")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public BaseSetupTenantRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Tenant user&#39;s last name
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant user's last name")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public BaseSetupTenantRequest company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Tenant user&#39;s company name
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant user's company name")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(String company) {
    this.company = company;
  }


  public BaseSetupTenantRequest jobTitle(String jobTitle) {
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Tenant user&#39;s job title
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant user's job title")
  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobTitle() {
    return jobTitle;
  }


  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  public BaseSetupTenantRequest country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Tenant user&#39;s country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant user's country")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(String country) {
    this.country = country;
  }


  public BaseSetupTenantRequest domain(String domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Tenant&#39;s sub domain
   * @return domain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant's sub domain")
  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomain() {
    return domain;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomain(String domain) {
    this.domain = domain;
  }


  public BaseSetupTenantRequest customerType(CustomerType customerType) {
    
    this.customerType = customerType;
    return this;
  }

   /**
   * Get customerType
   * @return customerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerType getCustomerType() {
    return customerType;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerType(CustomerType customerType) {
    this.customerType = customerType;
  }


  public BaseSetupTenantRequest deleteProtected(Boolean deleteProtected) {
    
    this.deleteProtected = deleteProtected;
    return this;
  }

   /**
   * Whether to make the tenant delete protected
   * @return deleteProtected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to make the tenant delete protected")
  @JsonProperty(JSON_PROPERTY_DELETE_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeleteProtected() {
    return deleteProtected;
  }


  @JsonProperty(JSON_PROPERTY_DELETE_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeleteProtected(Boolean deleteProtected) {
    this.deleteProtected = deleteProtected;
  }


  public BaseSetupTenantRequest deploymentConfig(InfraDeploymentSetupConfig deploymentConfig) {
    
    this.deploymentConfig = deploymentConfig;
    return this;
  }

   /**
   * Get deploymentConfig
   * @return deploymentConfig
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public InfraDeploymentSetupConfig getDeploymentConfig() {
    return deploymentConfig;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeploymentConfig(InfraDeploymentSetupConfig deploymentConfig) {
    this.deploymentConfig = deploymentConfig;
  }


  public BaseSetupTenantRequest convoyDeploymentConfig(ConvoyDeploymentConfig convoyDeploymentConfig) {
    
    this.convoyDeploymentConfig = convoyDeploymentConfig;
    return this;
  }

   /**
   * Get convoyDeploymentConfig
   * @return convoyDeploymentConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVOY_DEPLOYMENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConvoyDeploymentConfig getConvoyDeploymentConfig() {
    return convoyDeploymentConfig;
  }


  @JsonProperty(JSON_PROPERTY_CONVOY_DEPLOYMENT_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvoyDeploymentConfig(ConvoyDeploymentConfig convoyDeploymentConfig) {
    this.convoyDeploymentConfig = convoyDeploymentConfig;
  }


  public BaseSetupTenantRequest enabledClouds(List<CloudType> enabledClouds) {
    
    this.enabledClouds = enabledClouds;
    return this;
  }

  public BaseSetupTenantRequest addEnabledCloudsItem(CloudType enabledCloudsItem) {
    this.enabledClouds.add(enabledCloudsItem);
    return this;
  }

   /**
   * Get enabledClouds
   * @return enabledClouds
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENABLED_CLOUDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<CloudType> getEnabledClouds() {
    return enabledClouds;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED_CLOUDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnabledClouds(List<CloudType> enabledClouds) {
    this.enabledClouds = enabledClouds;
  }


  public BaseSetupTenantRequest dedicatedCloudAccounts(List<DedicatedCloudAccount> dedicatedCloudAccounts) {
    
    this.dedicatedCloudAccounts = dedicatedCloudAccounts;
    return this;
  }

  public BaseSetupTenantRequest addDedicatedCloudAccountsItem(DedicatedCloudAccount dedicatedCloudAccountsItem) {
    if (this.dedicatedCloudAccounts == null) {
      this.dedicatedCloudAccounts = new ArrayList<>();
    }
    this.dedicatedCloudAccounts.add(dedicatedCloudAccountsItem);
    return this;
  }

   /**
   * Get dedicatedCloudAccounts
   * @return dedicatedCloudAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEDICATED_CLOUD_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DedicatedCloudAccount> getDedicatedCloudAccounts() {
    return dedicatedCloudAccounts;
  }


  @JsonProperty(JSON_PROPERTY_DEDICATED_CLOUD_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDedicatedCloudAccounts(List<DedicatedCloudAccount> dedicatedCloudAccounts) {
    this.dedicatedCloudAccounts = dedicatedCloudAccounts;
  }


  public BaseSetupTenantRequest tenantPhase(TenantPhase tenantPhase) {
    
    this.tenantPhase = tenantPhase;
    return this;
  }

   /**
   * Get tenantPhase
   * @return tenantPhase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TenantPhase getTenantPhase() {
    return tenantPhase;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_PHASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantPhase(TenantPhase tenantPhase) {
    this.tenantPhase = tenantPhase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseSetupTenantRequest baseSetupTenantRequest = (BaseSetupTenantRequest) o;
    return Objects.equals(this.emailId, baseSetupTenantRequest.emailId) &&
        Objects.equals(this.initialCredits, baseSetupTenantRequest.initialCredits) &&
        Objects.equals(this.discount, baseSetupTenantRequest.discount) &&
        Objects.equals(this.supportPlan, baseSetupTenantRequest.supportPlan) &&
        Objects.equals(this.billingDisabled, baseSetupTenantRequest.billingDisabled) &&
        Objects.equals(this.billingConfig, baseSetupTenantRequest.billingConfig) &&
        Objects.equals(this.genieConfig, baseSetupTenantRequest.genieConfig) &&
        Objects.equals(this.firstName, baseSetupTenantRequest.firstName) &&
        Objects.equals(this.lastName, baseSetupTenantRequest.lastName) &&
        Objects.equals(this.company, baseSetupTenantRequest.company) &&
        Objects.equals(this.jobTitle, baseSetupTenantRequest.jobTitle) &&
        Objects.equals(this.country, baseSetupTenantRequest.country) &&
        Objects.equals(this.domain, baseSetupTenantRequest.domain) &&
        Objects.equals(this.customerType, baseSetupTenantRequest.customerType) &&
        Objects.equals(this.deleteProtected, baseSetupTenantRequest.deleteProtected) &&
        Objects.equals(this.deploymentConfig, baseSetupTenantRequest.deploymentConfig) &&
        Objects.equals(this.convoyDeploymentConfig, baseSetupTenantRequest.convoyDeploymentConfig) &&
        Objects.equals(this.enabledClouds, baseSetupTenantRequest.enabledClouds) &&
        Objects.equals(this.dedicatedCloudAccounts, baseSetupTenantRequest.dedicatedCloudAccounts) &&
        Objects.equals(this.tenantPhase, baseSetupTenantRequest.tenantPhase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, initialCredits, discount, supportPlan, billingDisabled, billingConfig, genieConfig, firstName, lastName, company, jobTitle, country, domain, customerType, deleteProtected, deploymentConfig, convoyDeploymentConfig, enabledClouds, dedicatedCloudAccounts, tenantPhase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSetupTenantRequest {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    initialCredits: ").append(toIndentedString(initialCredits)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    supportPlan: ").append(toIndentedString(supportPlan)).append("\n");
    sb.append("    billingDisabled: ").append(toIndentedString(billingDisabled)).append("\n");
    sb.append("    billingConfig: ").append(toIndentedString(billingConfig)).append("\n");
    sb.append("    genieConfig: ").append(toIndentedString(genieConfig)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    deleteProtected: ").append(toIndentedString(deleteProtected)).append("\n");
    sb.append("    deploymentConfig: ").append(toIndentedString(deploymentConfig)).append("\n");
    sb.append("    convoyDeploymentConfig: ").append(toIndentedString(convoyDeploymentConfig)).append("\n");
    sb.append("    enabledClouds: ").append(toIndentedString(enabledClouds)).append("\n");
    sb.append("    dedicatedCloudAccounts: ").append(toIndentedString(dedicatedCloudAccounts)).append("\n");
    sb.append("    tenantPhase: ").append(toIndentedString(tenantPhase)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
