// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package twilio.proxies;

public class MessageListResponsePager extends twilio.proxies.MessageListResponse
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Twilio.MessageListResponsePager";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		hasPrevious("hasPrevious"),
		hasNext("hasNext"),
		first_page_uri("first_page_uri"),
		end("end"),
		previous_page_uri("previous_page_uri"),
		uri("uri"),
		page_size("page_size"),
		start("start"),
		next_page_uri("next_page_uri"),
		num_pages("num_pages"),
		total("total"),
		last_page_uri("last_page_uri"),
		page("page"),
		messages("Twilio.messages");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MessageListResponsePager(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Twilio.MessageListResponsePager"));
	}

	protected MessageListResponsePager(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject messageListResponsePagerMendixObject)
	{
		super(context, messageListResponsePagerMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Twilio.MessageListResponsePager", messageListResponsePagerMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Twilio.MessageListResponsePager");
	}

	/**
	 * @deprecated Use 'MessageListResponsePager.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static twilio.proxies.MessageListResponsePager initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return twilio.proxies.MessageListResponsePager.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static twilio.proxies.MessageListResponsePager initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new twilio.proxies.MessageListResponsePager(context, mendixObject);
	}

	public static twilio.proxies.MessageListResponsePager load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return twilio.proxies.MessageListResponsePager.initialize(context, mendixObject);
	}

	/**
	 * @return value of hasPrevious
	 */
	public final Boolean gethasPrevious()
	{
		return gethasPrevious(getContext());
	}

	/**
	 * @param context
	 * @return value of hasPrevious
	 */
	public final Boolean gethasPrevious(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.hasPrevious.toString());
	}

	/**
	 * Set value of hasPrevious
	 * @param hasprevious
	 */
	public final void sethasPrevious(Boolean hasprevious)
	{
		sethasPrevious(getContext(), hasprevious);
	}

	/**
	 * Set value of hasPrevious
	 * @param context
	 * @param hasprevious
	 */
	public final void sethasPrevious(com.mendix.systemwideinterfaces.core.IContext context, Boolean hasprevious)
	{
		getMendixObject().setValue(context, MemberNames.hasPrevious.toString(), hasprevious);
	}

	/**
	 * @return value of hasNext
	 */
	public final Boolean gethasNext()
	{
		return gethasNext(getContext());
	}

	/**
	 * @param context
	 * @return value of hasNext
	 */
	public final Boolean gethasNext(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.hasNext.toString());
	}

	/**
	 * Set value of hasNext
	 * @param hasnext
	 */
	public final void sethasNext(Boolean hasnext)
	{
		sethasNext(getContext(), hasnext);
	}

	/**
	 * Set value of hasNext
	 * @param context
	 * @param hasnext
	 */
	public final void sethasNext(com.mendix.systemwideinterfaces.core.IContext context, Boolean hasnext)
	{
		getMendixObject().setValue(context, MemberNames.hasNext.toString(), hasnext);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final twilio.proxies.MessageListResponsePager that = (twilio.proxies.MessageListResponsePager) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Twilio.MessageListResponsePager";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
