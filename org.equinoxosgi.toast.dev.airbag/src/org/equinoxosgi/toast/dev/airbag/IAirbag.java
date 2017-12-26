package org.equinoxosgi.toast.dev.airbag;

public interface IAirbag {

	/* (non-Javadoc)
	 * @see org.equinoxosgi.toast.dev.airbag.FakeAirbag#addListener(org.equinoxosgi.toast.dev.airbag.IAirbagListener)
	 */
	void addListener(IAirbagListener listener);

	/* (non-Javadoc)
	 * @see org.equinoxosgi.toast.dev.airbag.FakeAirbag#removeListener(org.equinoxosgi.toast.dev.airbag.IAirbagListener)
	 */
	void removeListener(IAirbagListener listener);

}