/**
 *
 * $Id$
 */
package net.opengis.ows20.validation;

import net.opengis.ows20.AddressType;
import net.opengis.ows20.OnlineResourceType;
import net.opengis.ows20.TelephoneType;

/**
 * A sample validator interface for {@link net.opengis.ows20.ContactType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ContactTypeValidator {
  boolean validate();

  boolean validatePhone(TelephoneType value);
  boolean validateAddress(AddressType value);
  boolean validateOnlineResource(OnlineResourceType value);
  boolean validateHoursOfService(String value);
  boolean validateContactInstructions(String value);
}
