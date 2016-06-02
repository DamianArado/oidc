/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.oidc;

import java.net.URI;

import javax.mail.internet.InternetAddress;

/**
 * The OpenId Connection user info.
 * <p>
 * Related specifications:
 * <ul>
 * <li>OpenID Connect Core 1.0, section 5.1.
 * </ul>
 * 
 * @version $Id$
 * @since 1.2
 */
public interface OIDCUserInfo extends OIDCClaimsSet
{
    /**
     * Gets the UserInfo subject. Corresponds to the {@code sub} claim.
     *
     * @return The subject.
     */
    String getSubject();

    /**
     * Gets the full name. Corresponds to the {@code name} claim, with no language tag.
     *
     * @return The full name, {@code null} if not specified.
     */
    String getName();

    /**
     * Gets the given or first name. Corresponds to the {@code given_name} claim, with no language tag.
     *
     * @return The given or first name, {@code null} if not specified.
     */
    String getGivenName();

    /**
     * Gets the surname or last name. Corresponds to the {@code family_name} claim, with no language tag.
     *
     * @return The surname or last name, {@code null} if not specified.
     */
    String getFamilyName();

    /**
     * Gets the middle name. Corresponds to the {@code middle_name} claim, with no language tag.
     *
     * @return The middle name, {@code null} if not specified.
     */
    String getMiddleName();

    /**
     * Gets the casual name. Corresponds to the {@code nickname} claim, with no language tag.
     *
     * @return The casual name, {@code null} if not specified.
     */
    String getNickname();

    /**
     * Gets the preferred username. Corresponds to the {@code preferred_username} claim.
     *
     * @return The preferred username, {@code null} if not specified.
     */
    String getPreferredUsername();

    /**
     * Gets the profile page. Corresponds to the {@code profile} claim.
     *
     * @return The profile page URI, {@code null} if not specified.
     */
    URI getProfile();

    /**
     * Gets the picture. Corresponds to the {@code picture} claim.
     *
     * @return The picture URI, {@code null} if not specified.
     */
    URI getPicture();

    /**
     * Gets the web page or blog. Corresponds to the {@code website} claim.
     *
     * @return The web page or blog URI, {@code null} if not specified.
     */
    URI getWebsite();

    /**
     * Gets the preferred email address. Corresponds to the {@code email} claim.
     *
     * @return The preferred email address, {@code null} if not specified.
     */
    InternetAddress getEmail();

    /**
     * Gets the email verification status. Corresponds to the {@code email_verified} claim.
     *
     * @return The email verification status, {@code null} if not specified.
     */
    Boolean getEmailVerified();

    /**
     * Gets the gender. Corresponds to the {@code gender} claim.
     *
     * @return The gender, {@code null} if not specified.
     */
    String getGender();

    /**
     * Gets the date of birth. Corresponds to the {@code birthdate} claim.
     *
     * @return The date of birth, {@code null} if not specified.
     */
    String getBirthdate();

    /**
     * Gets the zoneinfo. Corresponds to the {@code zoneinfo} claim.
     *
     * @return The zoneinfo, {@code null} if not specified.
     */
    String getZoneinfo();

    /**
     * Gets the locale. Corresponds to the {@code locale} claim.
     *
     * @return The locale, {@code null} if not specified.
     */
    String getLocale();

    /**
     * Gets the preferred telephone number. Corresponds to the {@code phone_number} claim.
     *
     * @return The preferred telephone number, {@code null} if not specified.
     */
    String getPhoneNumber();

    /**
     * Gets the phone number verification status. Corresponds to the {@code phone_number_verified} claim.
     *
     * @return The phone number verification status, {@code null} if not specified.
     */
    Boolean getPhoneNumberVerified();

    /**
     * Gets the preferred address. Corresponds to the {@code address} claim, with no language tag.
     *
     * @return The preferred address, {@code null} if not specified.
     */
    OIDCAddress getAddress();

    // TODO: add support for lang tag
}